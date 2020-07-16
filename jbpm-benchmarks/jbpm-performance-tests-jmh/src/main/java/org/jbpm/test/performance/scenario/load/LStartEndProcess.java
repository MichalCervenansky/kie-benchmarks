package org.jbpm.test.performance.scenario.load;

import org.jbpm.test.performance.jbpm.JBPMController;
import org.jbpm.test.performance.jbpm.constant.ProcessStorage;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;


@State(Scope.Benchmark)
@Fork(value = 1, jvmArgs = {"-Xms2G", "-Xmx2G"})
@Warmup(iterations = 1, time = 1)
@Measurement(iterations = 1, time = 300)
@Threads(1)
public class LStartEndProcess {

    private static JBPMController jc;

    // ! Must be overridden using -p from command line
    @Param("")
    public String runtimeManagerStrategy;

    @Setup
    public void init() {
        // Sets jvm argument to runtimeManagerStrategy
        System.setProperty("jbpm.runtimeManagerStrategy", runtimeManagerStrategy);
        jc = JBPMController.getInstance();
        jc.createRuntimeManager(ProcessStorage.StartEnd.getPath());

    }


    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Benchmark
    public void Throughput() {
        execute();
    }

    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Benchmark
    public void averageTime(){
        execute();
    }


    private void execute() {
        RuntimeEngine runtimeEngine = jc.getRuntimeEngine();
        KieSession ksession = runtimeEngine.getKieSession();
        ksession.startProcess(ProcessStorage.StartEnd.getProcessDefinitionId());
    }

    @TearDown
    public void close() {
        jc.tearDown();
    }

}
