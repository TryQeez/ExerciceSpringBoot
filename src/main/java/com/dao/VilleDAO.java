package com.dao;

import com.dto.Ville;
import org.codehaus.jettison.json.JSONException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface VilleDAO {
    ArrayList<Ville> findVille(String codePostal) throws SQLException, JSONException;
}
