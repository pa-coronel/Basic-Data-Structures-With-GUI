
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.SwingConstants.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.JFrame.*;

public class compilation extends JFrame
{
    
    JButton about = new JButton("About");
    JButton array = new JButton("Array");
    JButton sorting = new JButton("Sorting");
    JButton recursion = new JButton("Recursion");
    JButton stacks = new JButton("Stacks");
    JButton queue = new JButton("Queue");
    JButton LL = new JButton("Linked List");
    JPanel indicate = new JPanel();
        int y = 20;
    JPanel design = new JPanel();
    
    JPanel Pabout = new JPanel();
    JPanel Parray = new JPanel();
    JPanel Psorting = new JPanel();
    JPanel Precursion = new JPanel();
    JPanel Pstacks = new JPanel();
    JPanel Pqueue = new JPanel();
    JPanel PLL = new JPanel();
    
    public compilation()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(500, 390);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.gray);     
        
        Pabout.setVisible(true);
        Parray.setVisible(false);
        Psorting.setVisible(false);
        Precursion.setVisible(false);
        Pstacks.setVisible(false);
        Pqueue.setVisible(false);
        PLL.setVisible(false);
        
        add(design);
        design.setSize(160, 400);
        design.setBackground(Color.DARK_GRAY);
        design.setLayout(null);
        
        design.add(indicate);
        indicate.setSize(20, 20);
        indicate.setLocation(10, y);
        indicate.setBackground(Color.green);
        
        design.add(about);
        about.setBounds(40, 10, 100, 40);
        about.setBorder(null);
        about.setBackground(new Color(14, 220, 231));
        about.setFont(new Font("OCR A Extended", 0, 20));
        about.setFocusable(false);
        about.setFocusPainted(false);
        about.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y);
            Pabout.setVisible(true);
            Parray.setVisible(false);
            Psorting.setVisible(false);
            Precursion.setVisible(false);
            Pstacks.setVisible(false);
            Pqueue.setVisible(false);
            PLL.setVisible(false);
        });
        about.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                about.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                about.setBackground(new Color(14, 220, 231));
            }
        });
        
        design.add(array);
        array.setBounds(40, 60, 100, 40);
        array.setBorder(null);
        array.setBackground(new Color(14, 220, 231));
        array.setFont(new Font("OCR A Extended", 0, 20));
        array.setFocusable(false);
        array.setFocusPainted(false);
        array.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*1);
            Pabout.setVisible(false);
            Parray.setVisible(true);
            Psorting.setVisible(false);
            Precursion.setVisible(false);
            Pstacks.setVisible(false);
            Pqueue.setVisible(false);
            PLL.setVisible(false);
        });
        array.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                array.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                array.setBackground(new Color(14, 220, 231));
            }       
        });
        
        design.add(sorting);
        sorting.setBounds(40, 110, 100, 40);
        sorting.setBorder(null);
        sorting.setBackground(new Color(14, 220, 231));
        sorting.setFont(new Font("OCR A Extended", 0, 20));
        sorting.setFocusable(false);
        sorting.setFocusPainted(false);
        sorting.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*2);
            Pabout.setVisible(false);
            Parray.setVisible(false);
            Psorting.setVisible(true);
            Precursion.setVisible(false);
            Pstacks.setVisible(false);
            Pqueue.setVisible(false);
            PLL.setVisible(false);
        });
        sorting.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                sorting.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sorting.setBackground(new Color(14, 220, 231));
            }
        });
        
        design.add(recursion);
        recursion.setBounds(40, 160, 100, 40);
        recursion.setBorder(null);
        recursion.setBackground(new Color(14, 220, 231));
        recursion.setFont(new Font("OCR A Extended", 1, 16));
        recursion.setFocusable(false);
        recursion.setFocusPainted(false);
        recursion.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*3);
            Pabout.setVisible(false);
            Parray.setVisible(false);
            Psorting.setVisible(false);
            Precursion.setVisible(true);
            Pstacks.setVisible(false);
            Pqueue.setVisible(false);
            PLL.setVisible(false);
        });
        recursion.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                recursion.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                recursion.setBackground(new Color(14, 220, 231));
            }    
        });
        
        design.add(stacks);
        stacks.setBounds(40, 210, 100, 40);
        stacks.setBorder(null);
        stacks.setBackground(new Color(14, 220, 231));
        stacks.setFont(new Font("OCR A Extended", 0, 20));
        stacks.setFocusable(false);
        stacks.setFocusPainted(false);
        stacks.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*4);
            Pabout.setVisible(false);
            Parray.setVisible(false);
            Psorting.setVisible(false);
            Precursion.setVisible(false);
            Pstacks.setVisible(true);
            Pqueue.setVisible(false);
            PLL.setVisible(false);
        });
        stacks.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                stacks.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                stacks.setBackground(new Color(14, 220, 231));
            }
        });
        
        design.add(queue);
        queue.setBounds(40, 260, 100, 40);
        queue.setBorder(null);
        queue.setBackground(new Color(14, 220, 231));
        queue.setFont(new Font("OCR A Extended", 0, 20));
        queue.setFocusable(false);
        queue.setFocusPainted(false);
        queue.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*5);
            Pabout.setVisible(false);
            Parray.setVisible(false);
            Psorting.setVisible(false);
            Precursion.setVisible(false);
            Pstacks.setVisible(false);
            Pqueue.setVisible(true);
            PLL.setVisible(false);
        });
        queue.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                queue.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                queue.setBackground(new Color(14, 220, 231));
            }
        });
        
        design.add(LL);
        LL.setBounds(40, 310, 100, 40);
        LL.setBorder(null);
        LL.setBackground(new Color(14, 220, 231));
        LL.setFont(new Font("OCR A Extended", 1, 14));
        LL.setFocusable(false);
        LL.setFocusPainted(false);
        LL.addActionListener((ActionEvent e) -> {
            indicate.setLocation(10, y+50*6);
            Pabout.setVisible(false);
            Parray.setVisible(false);
            Psorting.setVisible(false);
            Precursion.setVisible(false);
            Pstacks.setVisible(false);
            Pqueue.setVisible(false);
            PLL.setVisible(true);
        });
        LL.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                LL.setBackground(new Color(171, 248, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                LL.setBackground(new Color(14, 220, 231));
            }
        });
        
    }
    
    
    
    public void about()
    {
        add(Pabout);
        Pabout.setLayout(null);
        Pabout.setBounds(170, 10, 314, 340);
        JLabel name = new JLabel("CORONEL, PAUL ANDRIE N.");
        JLabel sec = new JLabel("BSIT - 2B1");
        JLabel compilation = new JLabel("COMPILATION OF CODES");
        JLabel logo = new JLabel("\u03A9");
        Pabout.add(compilation);
        compilation.setSize(314, 40);
        compilation.setFont(new Font("OCR A Extended", 1, 20));
        compilation.setForeground(new Color(3, 105, 105));
        compilation.setLocation(0, 50);
        compilation.setHorizontalAlignment(SwingConstants.CENTER);
        Pabout.add(logo);
        logo.setSize(314, 140);
        logo.setFont(new Font("Times New Roman", 1, 140));
        logo.setForeground(new Color(3, 105, 105));
        logo.setLocation(0, 100);
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        Pabout.add(name);
        name.setSize(314, 40);
        name.setFont(new Font("OCR A Extended", 1, 20));
        name.setForeground(new Color(3, 105, 105));
        name.setLocation(0, 250);
        name.setHorizontalAlignment(SwingConstants.CENTER);
        Pabout.add(sec);
        sec.setSize(314, 40);
        sec.setFont(new Font("OCR A Extended", 1, 18));
        sec.setForeground(new Color(3, 105, 105));
        sec.setLocation(0, 290);
        sec.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    private int count;
    public void array()
    {
        count = 0;
        add(Parray);
        Parray.setLayout(null);
        Parray.setBounds(170, 10, 314, 340);
        JLabel title = new JLabel("ARRAY");
        Parray.add(title);
        title.setSize(314, 20);
        title.setFont(new Font("OCR A Extended", 1, 20));
        title.setForeground(new Color(3, 105, 105));
        title.setLocation(0, 20);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        JTextField tf = new JTextField("Enter you want to put in the array");
        JButton getter = new JButton("add");
        JTextPane tp = new JTextPane();
        JButton reset = new JButton("Reset");
  
        getter.setEnabled(false);
        
        Parray.add(tf);
        tf.setBounds(30, 50, 254, 30);
        tf.setFont(new Font("Consolas", 0, 13));
        tf.setForeground(Color.GRAY);
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setBorder(null);
        tf.setBackground(new Color(189, 250, 253));
        tf.setEditable(false);
        tf.addMouseListener(new MouseAdapter()
        {   
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(count < 10){
                    tf.setEditable(true);
                    tf.setText("");
                    tf.setForeground(Color.black);
                    tf.setToolTipText("you can type now");
                    getter.setEnabled(true);
                }
            }
        });
     
        Parray.add(getter);
        getter.setBounds(117, 90, 80, 20);
        getter.setBorder(null);
        getter.setBackground(new Color(14, 220, 231));
        getter.setFont(new Font("OCR A Extended", 0, 14));
        getter.setFocusable(false);
        getter.setFocusPainted(false);
        getter.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                getter.setBackground(new Color(32, 236, 247));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getter.setBackground(new Color(14, 220, 231));
            }
        });
        
        
        Parray.add(tp);
        tp.setBounds(30, 120, 254, 180);
        tp.setFont(new Font("Consolas", 0, 14));
        tp.setForeground(Color.black);
            StyledDocument doc = tp.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
        tp.setBorder(null);
        tp.setBackground(new Color(189, 250, 253));
        tp.setEditable(false);
        
        getter.addActionListener((ActionEvent e) -> {
            if(count < 9){
                String temp = tf.getText();
                tf.setForeground(Color.GRAY);
                tf.setText("Enter you want to put in the array");
                tp.setText(tp.getText() + temp + "\n");
                getter.setEnabled(false);
                tf.setEditable(false);
                reset.setEnabled(true);
            }
            else{
                String temp = tf.getText();
                tf.setForeground(Color.GRAY);
                tf.setText("You have reached the limit");
                tp.setText(tp.getText() + temp + "\n");
                tf.setEnabled(false);
                getter.setEnabled(false);
                reset.setEnabled(true);
            }
            count++;
            System.out.println(count);
        });
        
        Parray.add(reset);
        reset.setEnabled(false);
        reset.setBounds(117, 310, 80, 20);
        reset.setBorder(null);
        reset.setBackground(new Color(14, 220, 231));
        reset.setFont(new Font("OCR A Extended", 0, 14));
        reset.setFocusable(false);
        reset.setFocusPainted(false);
        reset.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                reset.setBackground(new Color(32, 236, 247));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reset.setBackground(new Color(14, 220, 231));
            }
        });
        reset.addActionListener((ActionEvent e) -> {
            getter.setEnabled(true);
            tf.setEnabled(true);
            tf.setForeground(Color.GRAY);
            tf.setText("Enter you want to put in the array");
            tp.setText("");
            count = 0;
        });
    }
    
    public void sorting()
    {
        count = 0;
        add(Psorting);
        Psorting.setLayout(null);
        Psorting.setBounds(170, 10, 314, 340);
        JLabel title = new JLabel("SORTING");
        Psorting.add(title);
        title.setSize(314, 20);
        title.setFont(new Font("OCR A Extended", 1, 20));
        title.setForeground(new Color(3, 105, 105));
        title.setLocation(0, 20);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        JTextField tf = new JTextField("Enter you want to put in the array");
        JButton getter = new JButton("add");
        JTextPane tp = new JTextPane();
        JButton reset = new JButton("Reset");
        JButton sorter = new JButton("Sort");
        
        getter.setEnabled(false);
        
        Psorting.add(tf);
        tf.setBounds(30, 50, 254, 30);
        tf.setFont(new Font("Consolas", 0, 13));
        tf.setForeground(Color.GRAY);
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setBorder(null);
        tf.setBackground(new Color(189, 250, 253));
        tf.setEditable(false);
        tf.addMouseListener(new MouseAdapter()
        {   
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(count < 10){
                    tf.setEditable(true);
                    tf.setText("");
                    tf.setForeground(Color.black);
                    tf.setToolTipText("you can type now");
                    getter.setEnabled(true);
                }
            }
        });
     
        Psorting.add(getter);
        getter.setBounds(117, 90, 80, 20);
        getter.setBorder(null);
        getter.setBackground(new Color(14, 220, 231));
        getter.setFont(new Font("OCR A Extended", 0, 14));
        getter.setFocusable(false);
        getter.setFocusPainted(false);
        getter.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                getter.setBackground(new Color(32, 236, 247));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getter.setBackground(new Color(14, 220, 231));
            }
        });
        
        String[] ra = new String[10];
        for(int x = 0; x < ra.length; x++){
            ra[x] = new String();
        }
        Psorting.add(tp);
        tp.setBounds(30, 120, 254, 180);
        tp.setFont(new Font("Consolas", 0, 14));
        tp.setForeground(Color.black);
            StyledDocument doc = tp.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
        tp.setBorder(null);
        tp.setBackground(new Color(189, 250, 253));
        tp.setEditable(false);
        
        getter.addActionListener((ActionEvent e) -> {
            if(count < 9){
                String temp = tf.getText();
                tf.setForeground(Color.GRAY);
                tf.setText("Enter you want to put in the array");
                tp.setText(tp.getText() + temp + "\n");
                ra[count++] = temp;
                reset.setEnabled(true);
                getter.setEnabled(false);
                tf.setEditable(false);                
                sorter.setEnabled(true);
            }
            else{
                String temp = tf.getText();
                tf.setForeground(Color.GRAY);
                tf.setText("You have reached the limit");
                tp.setText(tp.getText() + temp + "\n");
                ra[count++] = temp;
                tf.setEnabled(false);
                getter.setEnabled(false);
                reset.setEnabled(true);
            }
            //count++;
            System.out.println(count);
        });
        
        Psorting.add(reset);
        reset.setEnabled(false);
        reset.setBounds(162, 310, 80, 20);
        reset.setBorder(null);
        reset.setBackground(new Color(14, 220, 231));
        reset.setFont(new Font("OCR A Extended", 0, 14));
        reset.setFocusable(false);
        reset.setFocusPainted(false);
        reset.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                reset.setBackground(new Color(32, 236, 247));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reset.setBackground(new Color(14, 220, 231));
            }
        });
        reset.addActionListener((ActionEvent e) -> {
            getter.setEnabled(true);
            sorter.setEnabled(false);
            tf.setEnabled(true);
            tf.setForeground(Color.GRAY);
            tf.setText("Enter you want to put in the array");
            tp.setText("");
            count = 0;
        });
        
        Psorting.add(sorter);
        sorter.setEnabled(false);
        sorter.setBounds(72, 310, 80, 20);
        sorter.setBorder(null);
        sorter.setBackground(new Color(14, 220, 231));
        sorter.setFont(new Font("OCR A Extended", 0, 14));
        sorter.setFocusable(false);
        sorter.setFocusPainted(false);
        sorter.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e) {
                sorter.setBackground(new Color(32, 236, 247));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sorter.setBackground(new Color(14, 220, 231));
            }
        });
        sorter.addActionListener((ActionEvent e) -> {
            tp.setText("");
            Arrays.sort(ra); 
            
                for (String items : ra) {
                    if(!items.equals("")){
                        tp.setText(tp.getText() + items + "\n");
                    }
                }
        });
        
    }
    
    public static void main(String[] args)
    {
        compilation add = new compilation();
        add.about();
        add.array();
        add.sorting();
    }
}
