package com.dao;

import com.dto.Coordonnee;
import com.dto.Ville;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class VilleDAOImpl implements VilleDAO {


    private String url = "jdbc:mysql://localhost:3306/exercice";
    private String user = "root";
    private String pwd = "";
    public Connection getConnection() throws SQLException{
        Connection connection;
        connection = DriverManager.getConnection(url,user,pwd);
        return connection;
    }


    @Override
    public ArrayList<Ville> findVille(String codePostal) throws SQLException{
        ArrayList<Ville> villes = new ArrayList<>();
            Statement statement = getConnection().createStatement();
            ResultSet rs;
            rs = statement.executeQuery("SELECT * from ville_france WHERE Code_postal ="+codePostal);
            while(rs.next()){
                Ville ville = new Ville();
                ville.setCodeCommune(rs.getString("Nom_commune"));
                ville.setNomCommune(rs.getString("Code_postal"));
                ville.setLibelleAcheminement(rs.getString("Libelle_acheminement"));
                villes.add(ville);
            }
        return villes;
    }
}
