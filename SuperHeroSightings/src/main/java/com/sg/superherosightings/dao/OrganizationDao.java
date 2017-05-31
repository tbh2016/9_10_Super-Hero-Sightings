/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.superherosightings.dao;

import com.sg.superherosightings.model.Organization;
import java.util.List;

/**
 *
 * @author yingy
 */
public interface OrganizationDao {

    public void addOrganization(Organization organization);

    public void deleteOrganization(int organizationId);

    public void updateOrganization(Organization organization);

    public Organization getOrganizationById(int id);

    public List<Organization> getAllOrganizations();

}
