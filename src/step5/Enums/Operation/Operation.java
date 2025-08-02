package step5.Enums.Operation;

public enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS{
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },TIMES{
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE{
        @Override
        public double apply(double x, double y) throws ArithmeticException {
            if(y == 0){
                throw new ArithmeticException("Делить на ноль нельзя!");
            }else{
                return x/y;
            }
        }
    };

    public abstract double apply(double x, double y);

}
