package Calculator; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//Where all the funky stuff happens 

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        recalculate(1, 1, "---");
    }

    public void control() {
        
        view.getAddButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setOperator("+");
                view.getOperator().setText(model.getOperator());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

        view.getSubButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setOperator("-");
                view.getOperator().setText(model.getOperator());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

        view.getMulButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setOperator("*");
                view.getOperator().setText(model.getOperator());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

        view.getDivButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setOperator("/");
                view.getOperator().setText(model.getOperator());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

        view.getResetButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setOperator("---");
                model.setLeftValue(1);
                model.setRightValue(1);
                view.getLeftText().setText("" + model.getLeftValue()); 
                view.getRightText().setText("" + model.getRightValue()); 
                view.getLeftSlider().setValue(model.getLeftValue());
                view.getRightSlider().setValue(model.getRightValue());
                view.getOperator().setText(model.getOperator());
            }
        });

        view.getExitButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        view.getLeftSlider().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                model.setLeftValue(((JSlider) e.getSource()).getValue());
                view.getLeftText().setText("" + model.getLeftValue());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

        view.getRightSlider().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                model.setRightValue(((JSlider) e.getSource()).getValue());
                view.getRightText().setText("" + model.getRightValue());
                recalculate(model.getLeftValue(), model.getRightValue(), model.getOperator());
            }
        });

    }

    public void recalculate(int left, int right, String operator) {
        switch(operator) {
            case "+":
                view.getResult().setText("" + (left + right));
                break;
            case "-":
                view.getResult().setText("" + (left - right));
                break;
            case "*":
                view.getResult().setText("" + (left * right));
                break;
            case "/":
                view.getResult().setText(String.format("%.4f", 1.0 * left / right));
                break;
            default:
                break; 
        }
    }
}