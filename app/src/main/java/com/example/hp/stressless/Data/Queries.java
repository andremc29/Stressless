package com.example.hp.stressless.Data;

import com.example.hp.stressless.models.Pending;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 16-08-2017.
 */

public class Queries {
    public List<Pending> pendings(){
      List<Pending> pendings= new ArrayList<>();
    List<Pending> pendingList=Pending.listAll(Pending.class);
        if(pendingList!= null && pendingList.size()>0){

        }
        return pendings;
    }

}
