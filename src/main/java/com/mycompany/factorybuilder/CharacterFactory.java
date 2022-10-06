
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if (type == null){
            throw new IllegalArgumentException("character type cammot be null");
        }
        if(name == null){
            throw new IllegalArgumentException("name cannot be null");
        }
        if (type == CharacterTypes.ARCHER){
            return new Archer(name);
        }else if (type == CharacterTypes.FLAG_BEARER){
            return new FlagBearer(name);
        }else if (type == CharacterTypes.KNIGHT){
            return new Knight(name);
        }
        return null;
    }
}
