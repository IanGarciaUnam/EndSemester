
package icc.base;

/**
* Define una persona con nombre, apellidos, fecha de nacimiento y curp.
* @author mindahrelfen
*/
public class Persona{

    /**
    * Nombre de la persona.
    */
    private String nombre;

    /**
    * Apellido paterno de la persona.
    */
    private String apP;

    /**
    * Apellido materno de la persona.
    */
    private String apM;

    /**
    * Curp de la persona.
    */
    private String curp;

    /**
    * Dia de nacimiento de la persona.
    */
    private int dia;

    /**
    * Mes de nacimiento de la persona.
    */
    private int mes;

    /**
    * Año de nacimiento de la persona.
    */
    private int año;

    /**
    * Sexo de la persona. true Hombre, false Mujer.
    */
    private boolean sexo;

    /**
    * Constructor que iniciliza todos los datos de la persona.
    * @param nombre Nombre de la persona.
    * @param apP Apellido paterno de la persona.
    * @param apM Apellido materno de la persona.
    * @param dia Dia de nacimiento de la persona.
    * @param mes Mes de nacimiento de la persona.
    * @param año Año de nacimiento de la persona.
    * @param sexo Sexo de la persona.
    */
    public Persona(String nombre, String apP, String apM, int dia, int mes, int año, boolean sexo){
        this.nombre = nombre;
        this.apP = apP;
        this.apM = apM;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.sexo = sexo;
        setCurp();
    }

    /**
    * Getter de nombre.
    * @return nombre de la persona
    */
    public String getNombre(){
        return nombre;
    }

    /**
    * Getter del apellido paterno.
    * @return Apellido paterno de la persona
    */
    public String getApP(){
        return apP;
    }

    /**
    * Getter del Apellido materno.
    * @return Apellido materno de la persona
    */
    public String getApM(){
        return apM;
    }

    /**
    * Getter de curp.
    * @return curp de la persona
    */
    public String getCurp(){
        return curp;
    }

    /**
    * Getter del dia de nacimiento.
    * @return dia de nacimiento de la persona
    */
    public int getDia(){
        return dia;
    }

    /**
    * Getter del mes de nacimiento.
    * @return mes de nacimiento de la persona
    */
    public int getMes(){
        return mes;
    }

    /**
    * Getter del año de nacimiento.
    * @return año de nacimiento de la persona
    */
    public int getAño(){
        return año;
    }

    /**
    * Getter del sexo.
    * @return sexo de la persona
    */
    public String getSexo(){
        return sexo ? "H" : "M";
    }

    private void setCurp(){
        StringBuilder sb = new StringBuilder();
        String s;
        sb.append(apP.substring(0, 2));
        sb.append(apM.substring(0, 1));
        sb.append(nombre.substring(0, 1));
        s = "00" + (año % 100);
        sb.append(s.substring(s.length() - 2));
        s = "00" + mes;
        sb.append(s.substring(s.length() - 2));
        s = "00" + dia;
        sb.append(s.substring(s.length() - 2));
        sb.append(getSexo());
        curp = sb.toString().toUpperCase();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(apP);
        sb.append(" ");
        sb.append(apM);
        sb.append(" ");
        sb.append(nombre);
        sb.append(" CURP: ");
        sb.append(curp);
        sb.append(" Fecha de Nacimiento: ");
        sb.append(año);
        sb.append(" ");
        sb.append(mes);
        sb.append(" ");
        sb.append(dia);
        sb.append(" Sexo: ");
        sb.append(getSexo());
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        Persona p;
        if(obj == null){
            return false;
        }else if(obj == this){
            return true;
        }else if(obj instanceof Persona){
            p = (Persona)obj;
            if(!curp.equals(p.curp)) return false;
            if(!apP.equals(p.apP)) return false;
            if(!apM.equals(p.apM)) return false;
            if(!nombre.equals(p.nombre)) return false;
            return true;
        }else{
            return false;
        }
    }
}