import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.Serializable;
import java.util.ArrayList;

public class Estudiantes extends JFrame implements Serializable {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox boxanio;
    private JComboBox boxmes;
    private JComboBox boxdia;
    private JComboBox comboBox4;
    private JCheckBox checkrojo;
    private JCheckBox checkverde;
    private JCheckBox checkninguno;
    private JButton botoncarga;
    private JButton botonguardar;
    private JButton botonanterior;
    private JButton botonsiguiente;
    private JLabel labelcodigo;
    private JLabel labelcedula;
    private JLabel labelnombres;
    private JLabel labelapellido;
    private JLabel labelsigno;
    private JLabel labelnacimiento;
    private JLabel labelcolor;
    private JLabel respuestaL;


    private String nombre;
    private String apellido;
    private int codigo;
    private int cedula;
    private String signo;
    private ArrayList nomest = new ArrayList();
    private ArrayList apest = new ArrayList();
    private ArrayList cedest = new ArrayList();
    private ArrayList codest = new ArrayList();
    private ArrayList anioest = new ArrayList();
    private ArrayList mesest = new ArrayList();
    private ArrayList diadest = new ArrayList();
    private boolean est=false;
    private int i=0;
    private JPanel estu;

    public Estudiantes(String nombre, String apellido, int codigo, int cedula, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.cedula = cedula;
        this.signo = signo;
        botonguardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomest.add(labelnombres.getText());
                apest.add(labelapellido.getText());
                codest.add(labelcodigo.getText());
                cedest.add(labelcedula.getText());
                labelnombres.setText("");
                labelapellido.setText("");
                labelcodigo.setText("");
                labelcedula.setText("");
                respuestaL.setText("Se a guardado el auto correctamente");
            }
        });
        boxanio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }


}

