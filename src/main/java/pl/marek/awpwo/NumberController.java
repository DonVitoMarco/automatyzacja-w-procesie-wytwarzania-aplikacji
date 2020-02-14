package pl.marek.awpwo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("number")
@AllArgsConstructor
public class NumberController {

    private NumberService numberService;

    @GetMapping(path = "current")
    public ResponseEntity<NumberResponse> get() {
        return new ResponseEntity<>(new NumberResponse(numberService.get()), HttpStatus.OK);
    }

    @PutMapping(path = "increment")
    public ResponseEntity<NumberResponse> incrementAndGet() {
        return new ResponseEntity<>(new NumberResponse(numberService.incrementAndGet()), HttpStatus.OK);
    }

    @PutMapping(path = "decrement")
    public ResponseEntity<NumberResponse> decrementAndGet() {
        return new ResponseEntity<>(new NumberResponse(numberService.decrementAndGet()), HttpStatus.OK);
    }
}
