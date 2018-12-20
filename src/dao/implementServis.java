/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import finalproject.servis;

/**
 *
 * @author Irham Rizady
 */
public interface implementServis {
    public void insert(servis s);
    public void update(servis s);
    public void delete (int id);
    public void select(servis s);
    public void loginUser(servis s);
}
