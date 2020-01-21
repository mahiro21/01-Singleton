/* 
 * Copyright 2020 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class CentroEducativo {

    private static CentroEducativo instance;
    //"Instance" es la función que nos permite
    //hacer que solo se instancie una única vez

    //Variables
    private int alumnos;

    private CentroEducativo() {
        // Hecemos privado el constructor para evitar nuevas instancias
    }

    //Getters y Setters  
    public static CentroEducativo getInstance() {
        if (instance == null) {
            instance = new CentroEducativo();
        }
        return instance;
    }

    //Getters & Setters
    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return String.format("Asistencias a clase hoy ..: %s",
                alumnos == 0 ? "La clase esta vacia" : alumnos + " alumnos");
    }

    public void mostrarInfo() {
        System.out.println(toString());
    }

}
