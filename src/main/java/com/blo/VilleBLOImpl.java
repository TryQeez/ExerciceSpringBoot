package com.blo;

import com.dao.VilleDAO;
import com.dto.Ville;
import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class VilleBLOImpl implements VilleBLO {

    @Autowired
    private VilleDAO villeDAO;

    @Override
    public ArrayList<Ville> getInfoVilles(String codePostal) throws SQLException, JSONException {
        //code metier
        return villeDAO.findVille(codePostal);
    }
}
