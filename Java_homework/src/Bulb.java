

public class Bulb {
    private Boolean state;
    
    Bulb()
    {
        state = Boolean.FALSE;
    }
    
    void TurnOn()
    {
        this.state = Boolean.TRUE;
    }
    
    void TurnOff()
    {
        this.state = Boolean.FALSE;
    }
    
    Boolean getState()
    {
        return this.state;
    }
}

 

 


