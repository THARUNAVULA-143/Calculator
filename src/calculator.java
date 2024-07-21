

public class calculator {
    int num1;
    int num2;
    int sum;

    public void addvalue(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        sum = num1 + num2;
        System.out.println(" adding is: " + " " + this.sum );
        return sum;
    }
    public int sub() {
        sum = num1 - num2;
        System.out.println(" subtract is: " + " " + this.sum);
        return sum;



//        public int getvalues( this.num1, this.num2){
//        System.out.println(getvalues());
//    }
    }
    public double multiply() {
        sum = num1 * num2;
        System.out.println(" multiply is: " + " " + this.sum);
        return sum;
    }
    public double division() {
        sum = num1 % num2;
        System.out.println(" division is: " + " " + this.sum);
        return sum;
    }


        public int getNum1() {
            return num1;
        }

        public void setNum1( int num1){
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2( int num2){
            this.num2 = num2;
        }

        public double getSum() {
            return sum;
        }

        public void setSum( int sum){
            this.sum = sum;
        }
    }

