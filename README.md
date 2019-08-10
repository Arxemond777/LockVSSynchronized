# Description
Jmh tests for demonstration difference between `Lock` and `Synchronized` for the following are JDKs: 7,8,11,12

# JDK 1.7.0_80, VM 24.80-b11
```bash
Result "benchmark.AppBenchmark.measure":
  60807.109 ±(99.9%) 267.581 ops/ms [Average]
  (min, avg, max) = (60508.508, 60807.109, 61101.398), stdev = 176.988
  CI (99.9%): [60539.528, 61074.689] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark               (lockMode)   Mode  Cnt      Score     Error   Units
AppBenchmark.measure  synchronized  thrpt   10  29262.797 ±  54.525  ops/ms
AppBenchmark.measure          lock  thrpt   10  60807.109 ± 267.581  ops/ms
```
# JDK 1.8.0_211, VM 25.211-b12
```bash
Result "benchmark.AppBenchmark.measure":
  60539.653 ±(99.9%) 303.409 ops/ms [Average]
  (min, avg, max) = (60050.751, 60539.653, 60747.128), stdev = 200.686
  CI (99.9%): [60236.244, 60843.063] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark               (lockMode)   Mode  Cnt      Score      Error   Units
AppBenchmark.measure  synchronized  thrpt   10  27588.384 ± 3081.887  ops/ms
AppBenchmark.measure          lock  thrpt   10  60539.653 ±  303.409  ops/ms
```
# JDK 11.0.4, VM 11.0.4+10-LTS
```bash
Result "benchmark.AppBenchmark.measure":
  63989.628 ±(99.9%) 519.561 ops/ms [Average]
  (min, avg, max) = (63052.659, 63989.628, 64241.403), stdev = 343.657
  CI (99.9%): [63470.067, 64509.189] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark               (lockMode)   Mode  Cnt      Score      Error   Units
AppBenchmark.measure  synchronized  thrpt   10  56094.551 ± 3132.949  ops/ms
AppBenchmark.measure          lock  thrpt   10  63989.628 ±  519.561  ops/ms
```
# JDK 12.0.1, VM 12.0.1+12
```bash
Result "benchmark.AppBenchmark.measure":
  65955.681 ±(99.9%) 737.940 ops/ms [Average]
  (min, avg, max) = (64634.808, 65955.681, 66299.716), stdev = 488.102
  CI (99.9%): [65217.740, 66693.621] (assumes normal distribution)


# Run complete. Total time: 00:00:49

Benchmark               (lockMode)   Mode  Cnt      Score      Error   Units
AppBenchmark.measure  synchronized  thrpt   10  57669.249 ± 2831.162  ops/ms
AppBenchmark.measure          lock  thrpt   10  65955.681 ±  737.940  ops/ms
```
