

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class CompanyTest
{
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
        User client1=new User("José Manuel","911111111","zemanel@yahoo.com");
        User client2=new User("António Francisco","922222222","tochico@hotmail.com");
        User seller1=new User("Fernando Fernandes","966777101","fefe@remax.pt");
        User seller2=new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
    }

    
    @Test
    public void testConstructor(){
    
        Company company=new Company();
        
        User client1=new User("José Manuel","911111111","zemanel@yahoo.com");
        company.registerClient(client1);
        
        Property property1= new Property("T3 Monte Belo",150000.0);
        company.registerProperty(property1);
        
        User seller1=new User("Fernando Fernandes","966777101","fefe@remax.pt");
        company.registerSeller(seller1);
        
        Sell sell1=new Sell(client1,seller1,property1);
        company.registerSell(sell1);
        
         
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
        
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }
}
