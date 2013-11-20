package com.spock.test.change;

import spock.lang.Specification

interface CustomDao {
	List<Integer> getIds();
	Model getModelById(int id);
}

class CustomModel {
	int id;
}

class CustomObject {
	CustomDao customDao
	
	public List<Object> createOutputSet() {
		List<Model> models = new ArrayList<Model>();
		List<Integer> ids = customDao.getIds();
		for (Integer id in ids) {
			models.add(customDao.getModelById(id));
		}
		return models;
	}
}

class TestSpec extends Specification {
	
	def 'crazy closures'() {
		def mockDao = Mock(CustomDao)
		def idSet = [9,10]
		
		given: 'An initialized object'
			def customObject = new CustomObject
			customObject.customDao = mockDao
		
		when: 'createOutput is called'
			def outputSet = customObject.createOutputSet()
			
		then: 'the following methods should be called'
			1*mockDao.getIds() >> {
				return idSet
			}
			
			for (int i=0; i<idSet.size(); i++) {
				int id = idSet.get(i)
				1*mockDao.getModelById(idSet.get(i)) >> {
					def tmp = new Model()
					int tmpId = id // idSet.get(i)
					return tmp
				}
			}
			
		and: 'each compute package is accurate'
			2 == outputSet.size()
			9 == outputSet.get(0).getId()
			10 == outputSet.get(1).getId()
		
	}
}