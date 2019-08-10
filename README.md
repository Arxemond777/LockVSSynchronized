# Description
Jmh tests for demonstration difference between `Lock` and `Synchronized` for the following are JDKs: 7,8,11,12

# JDK 1.7.0_80, VM 24.80-b11
```bash
Result "benchmark.AppBenchmark.doSynchronized":
  62877.155 ±(99.9%) 1629.504 ops/ms [Average]
  (min, avg, max) = (61592.970, 62877.155, 64841.049), stdev = 1077.816
  CI (99.9%): [61247.650, 64506.659] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark                            Mode  Cnt      Score      Error   Units
AppBenchmark.reentrantLockBenchmark  thrpt   10  71298.977 ±  591.663  ops/ms
AppBenchmark.synchronizedBenchmark   thrpt   10  62877.155 ± 1629.504  ops/ms
```
# JDK 1.8.0_211, VM 25.211-b12
```bash
Result "benchmark.AppBenchmark.doSynchronized":
  62071.018 ±(99.9%) 1867.326 ops/ms [Average]
  (min, avg, max) = (60064.296, 62071.018, 63959.567), stdev = 1235.121
  CI (99.9%): [60203.691, 63938.344] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark                            Mode  Cnt      Score      Error   Units
AppBenchmark.reentrantLockBenchmark  thrpt   10  70333.023 ± 2257.299  ops/ms
AppBenchmark.synchronizedBenchmark   thrpt   10  62071.018 ± 1867.326  ops/ms
```
# JDK 11.0.4, VM 11.0.4+10-LTS
```bash
Result "benchmark.AppBenchmark.synchronizedBenchmark":
  589919.811 ±(99.9%) 1198.928 ops/ms [Average]
  (min, avg, max) = (588463.636, 589919.811, 591150.934), stdev = 793.017
  CI (99.9%): [588720.882, 591118.739] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark                             Mode  Cnt       Score      Error   Units
AppBenchmark.reentrantLockBenchmark  thrpt   10   75072.313 ± 3832.511  ops/ms
AppBenchmark.synchronizedBenchmark   thrpt   10  589919.811 ± 1198.928  ops/ms
```
# JDK 12.0.1, VM 12.0.1+12
```bash
Result "benchmark.AppBenchmark.synchronizedBenchmark":
  560975.618 ±(99.9%) 12826.272 ops/ms [Average]
  (min, avg, max) = (547275.864, 560975.618, 572484.627), stdev = 8483.785
  CI (99.9%): [548149.346, 573801.890] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark                             Mode  Cnt       Score       Error   Units
AppBenchmark.reentrantLockBenchmark  thrpt   10   73276.825 ±  3171.605  ops/ms
AppBenchmark.synchronizedBenchmark   thrpt   10  560975.618 ± 12826.272  ops/ms
```
