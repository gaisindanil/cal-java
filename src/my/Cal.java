import javax.swing.*;
public class Cal{
    public static void main(String args[]) {
        JFrame a = new JFrame("Расход топлива");

        JLabel labelFuel = new JLabel("Цена топлива(руб)");
        labelFuel.setSize(200, 20);
        labelFuel.setLocation(40, 25);
        a.add(labelFuel);

        JTextField inputFuel = new JTextField();
        inputFuel.setBounds(40,50,300,20);
        a.add(inputFuel);

        JLabel labelDistance = new JLabel("Расстояние км");
        labelDistance.setSize(100, 20);
        labelDistance.setLocation(40, 75);
        a.add(labelDistance);

        JTextField inputDistance = new JTextField();
        inputDistance.setBounds(40,100,300,20);
        a.add(inputDistance);


        JLabel labelAveragePrice=  new JLabel("Средний расход на 100 км");
        labelAveragePrice.setSize(200, 20);
        labelAveragePrice.setLocation(40, 125);
        a.add(labelAveragePrice);

        JTextField inputAveragePrice = new JTextField();
        inputAveragePrice.setBounds(40,150,300,20);
        a.add(inputAveragePrice);

        JLabel innerText = new JLabel();
        innerText.setSize(400, 20);
        innerText.setLocation(40, 175);
        a.add(innerText);

        JButton button = new JButton("Рассчитать");
        button.setBounds(40,200,160,40);
        a.add(button);

        int calculationLiter = 100;
        button.addActionListener(e ->
        {
            //средний расход
            int average = Integer.parseInt(inputAveragePrice.getText());
            //расстояние
            int distance = Integer.parseInt(inputDistance.getText());
            //цена топлива
            int priceFuel = Integer.parseInt(inputFuel.getText());

           int calculationPrice = distance * priceFuel / average;
           int liter = distance / average;


            innerText.setText("Понадобиться "+liter+" литров топлива, обойдется "+calculationPrice+" руб");


        });

        a.setSize(470,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}