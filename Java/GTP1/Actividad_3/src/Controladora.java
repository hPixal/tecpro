import java.util.ArrayList;

public class Controladora {
    ArrayList<Facultad> facultades;
    ArrayList<Carrera> carreras;
    ArrayList<Alumno> alumnos;
    Integer fLastID;
    Integer cLastID;
    
    public Controladora() {
        this.fLastID = 0;
        this.cLastID = 0;
        facultades = new ArrayList<Facultad>();
        alumnos = new ArrayList<Alumno>();
    }

    public void crearFacultad(String nombre){
        fLastID++;
        Facultad add = new Facultad(nombre,fLastID);
        this.facultades.add(add);
    }

    public void creardCarrera(String nombre, Integer idFacultad){
        cLastID++;
        Facultad auxFacultad = getFacultad(idFacultad);
        if(auxFacultad != null){
            Carrera add = new Carrera(nombre, auxFacultad,cLastID);
            this.carreras.add(add);
        }
    }

    public void CrearAlumno(String nombre, Integer dni, LocalDate fechaDeNacimiento, Boolean sexo){
        
    }

    public Integer getfIDPosition(Integer fID){
        Integer errorCase = -1;
        for(Integer i = 0 ; i < facultades.size() ; i++){
            Facultad auxFacultad = this.facultades.get(i);
            Integer auxID = auxFacultad.getId();
            if(auxID == fID){
                return i;
            }
        }
        return errorCase;
    }

    public Integer getcIDPostion(Integer cID){
        Integer errorCase = -1;
        for(Integer i = 0 ; i < facultades.size() ; i++){
            Carrera auxCarreras = this.carreras.get(i);
            Integer auxID = auxCarreras.getId();
            if(auxID == cID){
                return i;
            }
        }
        return errorCase;
    }

    public Facultad getFacultad(Integer idFacultad){
        Integer auxPos = getfIDPosition(idFacultad);
        if(auxPos != -1){
            Facultad returnFacu = facultades.get(auxPos);
            return returnFacu;
        }
        return null;
    }
}
