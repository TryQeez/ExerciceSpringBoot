package com.blo;

import com.dto.Ville;
import org.codehaus.jettison.json.JSONException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface VilleBLO {
    ArrayList<Ville> getInfoVilles(String codePostal) throws SQLException, JSONException;
}
