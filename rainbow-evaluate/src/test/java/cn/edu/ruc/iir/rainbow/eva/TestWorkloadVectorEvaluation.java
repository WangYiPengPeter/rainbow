package cn.edu.ruc.iir.rainbow.eva;

import cn.edu.ruc.iir.rainbow.common.cmd.Invoker;
import cn.edu.ruc.iir.rainbow.common.exception.InvokerException;
import cn.edu.ruc.iir.rainbow.common.util.ConfigFactory;
import cn.edu.ruc.iir.rainbow.eva.invoker.InvokerWorkloadVectorEvaluation;
import org.junit.Test;

import java.util.Properties;

public class TestWorkloadVectorEvaluation
{
    @Test
    public void test()
    {
        ConfigFactory.Instance().LoadProperties("/home/hank/Desktop/rainbow/rainbow-evaluate/rainbow.properties");
        Properties params = new Properties();
        params.setProperty("method", "PRESTO");
        params.setProperty("format", "ORC");
        params.setProperty("table.dirs", "/rainbow2/orc,/rainbow2/orc_ordered");
        params.setProperty("table.names", "orc,orc_ordered");
        params.setProperty("workload.file", "/home/hank/Desktop/rainbow/rainbow-evaluate/workload.txt");
        params.setProperty("log.dir", "/home/hank/Desktop/rainbow/rainbow-evaluate/workload_eva/");
        params.setProperty("drop.cache", "false");

        Invoker invoker = new InvokerWorkloadVectorEvaluation();
        try
        {
            invoker.executeCommands(params);
        } catch (InvokerException e)
        {
            e.printStackTrace();
        }
    }
}
