package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService
{
    double montant;
    @WebMethod
    public double Conversion(@WebParam double montant)
    {
        montant=montant*3.6;
        return montant;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        return new Compte(code,0,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> Comptes =new ArrayList<Compte>();
        Comptes.add(new Compte(1,400,new Date()));
        Comptes.add(new Compte(2,100,new Date()));
        Comptes.add(new Compte(3,0,new Date()));
        return Comptes;
    }
}
