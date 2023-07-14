import javax.swing.*;
import java.io.Serializable;

public class Estudiantes extends JFrame implements Serializable {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox boxanio;
    private JComboBox boxmes;
    private JComboBox boxdia;
    private JComboBox comboBox4;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
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


    private String nombre;
    private String apellido;
    private int codigo;
    private int cedula;
    private String signo;

    public Estudiantes(String nombre, String apellido, int codigo, int cedula, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.cedula = cedula;
        this.signo = signo;
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

