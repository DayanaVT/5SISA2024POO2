
import java.util.*;

import javax.swing.JFrame;
public class AccionesPersona {
    
    /**Vamos a hacer un crud */
    //mostrar persona
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    //listar a las personas
    public ArrayList<Persona>mostrarPersonas(){
        return listaPersonas;
    }

    //registrar
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }

    //buscar persona
    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontrada;
    }

    //actualizar
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listaPersonas.remove(actualizar);
        listaPersonas.add(actualizar);
    }
    
    //eliminar
    public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
    }

    JFrame frame = new JFrame("CRUD PERSONAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton registrarBtn = new JButton("Registrar Persona");
        JButton mostrarBtn = new JButton("Mostrar Personas");
        JButton editarBtn = new JButton("Editar Persona");
        JButton eliminarBtn = new JButton("Eliminar Persona");

        JPanel panel = new JPanel();
        panel.add(registrarBtn);
        panel.add(mostrarBtn);
        panel.add(editarBtn);
        panel.add(eliminarBtn);
        
        frame.add(panel);

        registrarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerfomed(ActionEvent e) {

            }
        });

        mostrarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
    
           }
        });

        editarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });

        eliminarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        frame.setVisible(true);
    

}
