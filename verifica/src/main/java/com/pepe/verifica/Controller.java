package com.pepe.verifica;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController

// localhost:8080/template/metodo1?name=pippo
@RequestMapping("/template")
public class Controller {
    @GetMapping("/metodo1")
    public String GetTemplate(@RequestParam(name = "name", defaultValue = "pippo", required = false) String nome,
            @RequestParam("password") String password) {
        return nome;
    }

    // localhost:8080/template/metodo2/ciao
    @GetMapping("/metodo2/{name}")
    public String GetTemplate2(@PathVariable(name = "name") String nome) {
        return nome;
    }

    /*
     * Connection conn = DBconnection.createNewDBconnection();
     * 
     * try {
     * String query1 = "SELECT Username, Password FROM utenti where Username='" +
     * username + "' AND Password='"
     * + HashPwd.getMd5(password) + "'";
     * PreparedStatement ps1 = conn.prepareStatement(query1);
     * ResultSet ris1 = ps1.executeQuery(); //solo per il SELECT
     * 
     * int id = ris1.getInt("Id"); //prendo il valore della colonna messa nel SELECT
     * 
     * 
     * if (ris1.next()) {
     * risultato = response.error("utente gia registrato");
     * } else {
     * String query2 = "INSERT INTO utenti(Username, Password) VALUES(?, ?)";
     * PreparedStatement ps2 = conn.prepareStatement(query2);
     * 
     * ps2.setString(1, username);
     * ps2.setString(2, HashPwd.getMd5(password));
     * ps2.executeUpdate(); //INSERT, UPDATE, DELETE
     * }
     * }
     * }
     */
}
