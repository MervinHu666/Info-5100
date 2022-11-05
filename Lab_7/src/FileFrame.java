import javax.swing.*;
import java.awt.*;


public class FileFrame extends JFrame {//set read and write

    JPanel readJPanel = new JPanel();

    JPanel writeJPanel = new JPanel();

    private String readFileName = "annual.csv";

    private String writeFileName = "";




    public FileFrame(){//set the field to input file
        GridLayout gridLayout = new GridLayout();
        gridLayout.setHgap(6);
        setLayout(gridLayout);
        add(readJPanel);
        initReadJPanel();
        add(writeJPanel);
        initWriteJPanel();
        pack();
        setTitle("FileFrame");
        setSize(800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void initReadJPanel(){
        readJPanel.setLayout(new GridLayout(4,1));
        readJPanel.setSize(400,400);
        JLabel fileTitle = new JLabel("Reading File Name");
        fileTitle.setSize(100,50);
        readJPanel.add(fileTitle);
        JTextField jTextField = new JTextField("annual.csv");
        jTextField.addCaretListener(event->{
            readFileName = jTextField.getText();
        });
        readJPanel.add(jTextField);//set read and save
        JTextArea jTextArea = new JTextArea();
        jTextArea.setSize(200,300);
        jTextArea.setEnabled(false);
        JButton jButton = new JButton("Click to read from file");
        jButton.addActionListener(e->{
            jTextArea.setText(CsvUtil.read5Line(readFileName));
            validate();
        });
        readJPanel.add(jButton);
        readJPanel.add(jTextArea);

    }

    public void initWriteJPanel(){
        writeJPanel.setLayout(new GridLayout(4,1));
        writeJPanel.setSize(400,400);
        JLabel fileTitle = new JLabel("File name to write");
        fileTitle.setSize(100,50);
        writeJPanel.add(fileTitle);
        JTextField jTextField = new JTextField(writeFileName);
        jTextField.addCaretListener(event->{
            writeFileName = jTextField.getText();
        });
        writeJPanel.add(jTextField);
        JTextArea jTextArea = new JTextArea();
        jTextArea.setSize(200,300);
        jTextArea.setEnabled(false);
        JButton jButton = new JButton("Click to write to file");
        jButton.addActionListener(e->{
            CsvUtil.write3RowToNewFile(readFileName,writeFileName);
            jTextArea.setText(CsvUtil.read5Line(writeFileName));
            validate();
        });
        writeJPanel.add(jButton);
        writeJPanel.add(jTextArea);

    }
}
