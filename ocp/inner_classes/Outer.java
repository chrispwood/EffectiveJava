    public class Outer {
        private final String className = "outer";
        
        public Outer() {}

        public void doThings() {
            class Inner {
                private final String className = "inner";
                public Inner() {}
                public void doThings() {
                    class InnerInner {
                        private final String className = "inner-inner";
                        public InnerInner() {}
                        public void doThings() {
                            System.out.println("Outer class: "+Outer.this.className);
                            // How to access the Inner member?
                            System.out.println("InnerInner class: "+this.className);
                        }
                    }
                    
                    InnerInner ii = new InnerInner();
                    ii.doThings();
                }
            }

            Inner i = new Inner();
            i.doThings();
        }

        public static void main(String args[]) {
            Outer o = new Outer();
            o.doThings();
        }
    }