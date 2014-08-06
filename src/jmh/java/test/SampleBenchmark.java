package test;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(5)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
public class SampleBenchmark {
  @Benchmark
  public long baseLine() {
    return Long.MAX_VALUE;
  }
}
