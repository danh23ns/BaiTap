package Java_I_O_Stream.T2.Views;

import Java_I_O_Stream.T2.Model.File_Models;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class File_Views2 extends JFrame {
    private File_Models fileModels;

    public File_Views2(String tenRoot,String duongDan)  {
        this.fileModels = new File_Models(tenRoot,duongDan);
        this.setTitle("PHI HÒA HANDSOME");
        this.setVisible(true);
        this.init();
    }


    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea("Phi Hòa đẹp trai");
        textArea.setEditable(false); //Không được chỉnh sửa
        JTree tree = new JTree(fileModels.getRoot());
        JScrollPane scrollPane = new JScrollPane(tree);
        this.add(textArea,BorderLayout.CENTER);
        this.add(scrollPane, BorderLayout.WEST);
    }
}
