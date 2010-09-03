package org.neo4j.kernel.ha;

import java.util.Map;

import org.neo4j.kernel.ha.zookeeper.Machine;

public abstract class AbstractBroker implements Broker
{
    private final int myMachineId;

    public AbstractBroker( int myMachineId )
    {
        this.myMachineId = myMachineId;
    }
    
    public void setLastCommittedTxId( long txId )
    {
        // Do nothing
    }
    
    public int getMyMachineId()
    {
        return this.myMachineId;
    }
    
    public void shutdown()
    {
        // Do nothing
    }

    public Machine getMasterExceptMyself()
    {
        throw new UnsupportedOperationException();
    }
    
    public void rebindMaster()
    {
        // Do nothing
    }
    
    public static BrokerFactory wrapSingleBroker( final Broker broker )
    {
        return new BrokerFactory()
        {
            public Broker create( String storeDir, Map<String, String> graphDbConfig )
            {
                return broker;
            }
        };
    }
}
