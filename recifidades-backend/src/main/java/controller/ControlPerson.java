package controller;

import interfaces.interfaceRecificidades;
import model.person.person;
import model.person.PJ;
import model.person.PF;

import repository.RepositorioPerson;
import repository_jpa.PersonRepository;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ControlPerson {
    RepositorioPerson persons;
    person person = new person();
    Scanner sc = new Scanner(System.in);
    String email;
    int id;
}
