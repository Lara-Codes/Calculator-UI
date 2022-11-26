package Calculator; 
public class Model {
    //Need to keep track of left value, right value, and current operation 
    private int leftValue; //Dependent on sliders 
    private int rightValue; 
    private String operator; //Dependent on buttons 

    //Don't have to keep track of result value because it's dependent on left and right 


    public Model() {
        leftValue = 1;
        rightValue = 1;
        operator = "---";
    }

    public int getLeftValue(){
        return leftValue; 
    }
    
    public int getRightValue(){
        return rightValue; 
    }

    public String getOperator() {
        return operator;
    }
    
    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }

    public void setLeftValue(int leftValue){
        this.leftValue = leftValue; 
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
