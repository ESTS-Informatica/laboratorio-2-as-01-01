

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class PropertyTest
{
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
    {
        
        
    }

    
    
    @Test
    public void testConstructor(){
        Property property= new Property("",1.0);
        Property property1= new Property("T3 Monte Belo",150000.0);
        
        assertEquals(1.0,property.getPrice(), 0.0);
        assertEquals("",property.getDescription());
    
  
    }
    
    @Test
    public void testToString(){
        Property property1= new Property("T3 Monte Belo",150000.0);
        assertEquals("Descricao:T3 Monte Belo",property1.toString());
    
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
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
