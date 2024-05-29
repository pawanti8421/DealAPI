import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;


class converter
{
    JFrame temp=new JFrame("Temperature Converter");
    converter()
    {
        Font f1=new Font("Arial", Font.BOLD,20);
        Font f2=new Font("Arial",Font.BOLD,26);
        Font f3= new Font("Arial",Font.ITALIC,18);

        JLabel cel=new JLabel("Celsius(°C)");
        cel.setBounds(45,235,140,60);
        cel.setFont(f1);
        temp.add(cel);

        JTextField tcel=new JTextField("0");
        tcel.setBounds(45,150,140,100);
        tcel.setFont(f2);
        temp.add(tcel);

        JLabel ctf=new JLabel("=");
        ctf.setBounds(202,165,50,60);
        ctf.setFont(f2);
        temp.add(ctf);

        JLabel fah=new JLabel("Fahrenheit(°F)");
        fah.setBounds(230,235,140,60);
        fah.setFont(f1);
        temp.add(fah);

        JTextField tfah=new JTextField("32");
        tfah.setBounds(230,150,140,100);
        tfah.setFont(f2);
        temp.add(tfah);

        JLabel ctk=new JLabel("=");
        ctk.setBounds(388,165,50,60);
        ctk.setFont(f2);
        temp.add(ctk);

        JLabel kel=new JLabel("Kelvin(K)");
        kel.setBounds(415,235,140,60);
        kel.setFont(f1);
        temp.add(kel);

        JTextField tkel=new JTextField("273.15");
        tkel.setBounds(415,150,140,100);
        tkel.setFont(f2);
        temp.add(tkel);

        JButton sub=new JButton("Convert");
        sub.setFont(f1);
        sub.setBounds(230,320,120,40);
        temp.add(sub);

        JLabel f =new JLabel("");
        f.setBounds(20,400,150,50);
        f.setFont(f3);
        temp.add(f);

        JLabel t1=new JLabel("");
        t1.setBounds(20,430,450,50);
        t1.setFont(f3);
        temp.add(t1);

        JLabel t2=new JLabel("");
        t2.setBounds(20,460,450,50);
        t2.setFont(f3);
        temp.add(t2);






        sub.addActionListener(e -> {
            Float dcel = Float.valueOf(tcel.getText());
            Float dcfah = Float.valueOf(tfah.getText());
            Float dckel = Float.valueOf(tkel.getText());

            DecimalFormat df = new DecimalFormat("0.000");


            Float f11, k1;
            Float c2,k2;
            Float c3, f31;

            f11 = (dcel * 9/5) + 32;
            k1 =  (dcel + 273.15F);

            c2 = (dcfah - 32) * 5/9;
            k2 =  ((dcfah - 32) * 5/9 + 273.15F);


            c3 = (dckel - 273.15F);
            f31 =  ((dckel - 273.15F) * 9/5 + 32);





            if (!df.format(k1).equals(df.format(dckel)) && !df.format(f11).equals(df.format(dcfah))) {

                tcel.setText(String.valueOf(dcel));
                tfah.setText(String.valueOf(f11));
                tkel.setText(String.valueOf(k1));


                f.setText("Formula:");
                t1.setText("("+ dcel +"°C * 9 / 5) + 32 = "+ f11 +"°F");
                t2.setText(dcel +"°C + 273.15 = "+ k1 +"K");


            } else if (!df.format(k2).equals(df.format(dckel)) && !df.format(c2).equals(df.format(dcel))) {

                tcel.setText(String.valueOf(c2));
                tfah.setText(String.valueOf(dcfah));
                tkel.setText(String.valueOf(k2));

                f.setText("Formula:");
                t1.setText("("+ dcfah +"°F - 32) * 5 / 9 = "+ c2 +"°C");
                t2.setText("("+ dcfah +"°F - 32) * 5 / 9 + 273.15 = "+ k2 +"K");


            } else if (!df.format(c3).equals(df.format(dcel)) && !df.format(f31).equals(df.format(dcfah))) {

                tcel.setText(String.valueOf(c3));
                tfah.setText(String.valueOf(f31));
                tkel.setText(String.valueOf(dckel));

                f.setText("Formula:");
                t1.setText(dckel +"K - 273.15 = "+ c3 +"°C");
                t2.setText("("+ dckel +"K - 273.15) * 9 / 5 + 32 = "+ f31 +"°F");


            }



        });


        temp.setLayout(null);
        temp.setSize(600,600);
        temp.setVisible(true);
        temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}

public class tempconverter {

    public static void main(String []args)
    {
        converter ct=new converter();


    }

}
