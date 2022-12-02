package ru.mirea.task19.studentexeption;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {

    private ArrayList<Student> students;
    private JTable studTable;

    public LabClassUI(ArrayList<Student> students){
        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        this.students = students;

        JPanel pN = new JPanel(new FlowLayout());
        JButton sortStudentBtn = new JButton("Отсортировать по баллам");
        JButton findStudentBtn = new JButton("Найти студента");

        pN.add(sortStudentBtn);
        pN.add(findStudentBtn);

        sortStudentBtn.addActionListener(e -> {
            sortStudents(new ScoreComparator());
        });

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        Object[] headers = new String[] {"Имя", "Возраст", "Группа", "Средний балл"};
        Object [][] studentsData = new String[students.size()][4];
        for(int i = 0; i < students.size(); i++){
            studentsData[i][0] = students.get(i).getName();
            studentsData[i][1] = ((Integer)(students.get(i).getAge())).toString();
            studentsData[i][2] = ((Integer)(students.get(i).getGroup())).toString();
            studentsData[i][3] = ((Integer)(students.get(i).getGpa())).toString();
        }
        studTable = new JTable( new DefaultTableModel(studentsData, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }

    private void sortStudents(Comparator<Student> comp){
        Student temp;
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getName(), st.getAge(), st.getGroup(), st.getGpa()});
        }
    }

    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомое имя");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        students.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }
}