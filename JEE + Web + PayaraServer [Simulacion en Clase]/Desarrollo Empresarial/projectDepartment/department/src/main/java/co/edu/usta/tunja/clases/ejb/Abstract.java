package co.edu.usta.tunja.clases.ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class Abstract<T> {
    //Aqui se realizaran las consultas generales para cualquier tabla, agregar, eliminar, actualizar, listar
    //T-->es el template ( es un parametro  para la clase)

    private final Class<T> entidad; //el parametro T sera una clase

    protected abstract EntityManager getAdmEntidad(); //el metodo abstracto minimo en esta clase abstracta

    public Abstract(Class<T> entidad) {
        this.entidad = entidad;
    }

    public void grabar(T entidad) {
        getAdmEntidad().persist(entidad); //para grabar o guardar cualquier entidad en la base de datos
    }

    public List<T> listar() {
        CriteriaBuilder cb = getAdmEntidad().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entidad);
        cq.select(cq.from(entidad));
        List<T> allData = getAdmEntidad().createQuery(cq).getResultList();
        return allData;
    }
/*
    public void borrar(T entidad) {
        getAdmEntidad().remove(entidad);
    }

    public void actualizar(T entidad) {
        getAdmEntidad().merge(entidad);
    }

    public T buscar(Object id) {
        return getAdmEntidad().find(entidad, id);
    }
*/
}
/*
SELECT pte
FROM ProductTypeEntity pte
WHERE
 */
