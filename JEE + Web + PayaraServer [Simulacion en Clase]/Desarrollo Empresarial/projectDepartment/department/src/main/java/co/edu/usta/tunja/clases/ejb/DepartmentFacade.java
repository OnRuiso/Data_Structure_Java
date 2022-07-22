/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.clases.ejb;

import co.edu.usta.tunja.clases.entity.DepartmentEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruiso
 */
@Stateless
public class DepartmentFacade extends Abstract<DepartmentEntity>{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "departmentPU")
    private EntityManager _em;
    
    @Override
    protected EntityManager getAdmEntidad(){
        return this._em;
    }
    
    public DepartmentFacade(){
        super(DepartmentEntity.class);
    }
}
