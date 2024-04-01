package com.jade.banking;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExampleService {
	
	@Scheduled(cron = "0 * * * * *")
	public void printMyName() {
		System.out.println("Sekhar Babu Patnam");
	}

  public String work() {
    sleep(7000, TimeUnit.MILLISECONDS); /* Pretend to be busy... */
    char[] str = new char[5];
    ThreadLocalRandom current = ThreadLocalRandom.current();
    for (int idx = 0; idx < str.length; ++idx)
      str[idx] = (char) ('A' + current.nextInt(26));
    String msg = new String(str);
    System.out.println("Generated message: " + msg);
    return msg;
  }

  public static void sleep(long average, TimeUnit unit) {
    String name = Thread.currentThread().getName();
    long timeout = Math.min(exponential(average), Math.multiplyExact(10, average));
    System.out.printf("%s sleeping %d %s...%n", name, timeout, unit);
    try {
      unit.sleep(timeout);
      System.out.println(name + " awoke.");
    } catch (InterruptedException abort) {
      Thread.currentThread().interrupt();
      System.out.println(name + " interrupted.");
    }
  }

  public static long exponential(long avg) {
    return (long) (avg * -Math.log(1 - ThreadLocalRandom.current().nextDouble()));
  }

}