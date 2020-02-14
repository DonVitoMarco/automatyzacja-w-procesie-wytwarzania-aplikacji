package pl.marek.awpwo;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class NumberService {

    private AtomicInteger number = new AtomicInteger();

    public int get() {
        return number.get();
    }

    public int incrementAndGet() {
        return number.incrementAndGet();
    }

    public int decrementAndGet() {
        return number.decrementAndGet();
    }
}
