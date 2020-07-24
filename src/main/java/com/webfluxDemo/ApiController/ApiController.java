package com.webfluxDemo.ApiController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping(value="v1/getWith5msLatency")
    public Mono<Long> getWith5msLatency() {
        return Mono.delay(Duration.ofMillis(5));
    }

    @RequestMapping(value="v1/getWith25msLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith25msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=4; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(5));
    }

    @RequestMapping(value="v1/getWith50msLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith50msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=4; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(10));
    }

    @RequestMapping(value="v1/getWith75msLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith75msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(5));
    }

    @RequestMapping(value="v1/getWith100msLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith100msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(10));
    }

    @RequestMapping(value="v1/postWith150msLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith150msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(15));
    }

    @RequestMapping(value="v1/postWith200msLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith200msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(20));
    }

    @RequestMapping(value="v1/postWith300msLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith300msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(30));
    }

    @RequestMapping(value="v1/postWith400msLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith400msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(40));
    }

    @RequestMapping(value="v1/postWith500msLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith500msLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(50));
    }

    @RequestMapping(value="v1/getWith1sLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith1sLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofMillis(100));
    }

    @RequestMapping(value="v1/getWith10sLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith10sLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofSeconds(1));
    }

    @RequestMapping(value="v1/postWith30sLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith30sLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofSeconds(3));
    }

    @RequestMapping(value="v1/postWith50sLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith50sLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofSeconds(5));
    }

    @RequestMapping(value="v1/postWith1mLatency", method = RequestMethod.POST, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> postWith1mLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofSeconds(6));
    }

    @RequestMapping(value="v1/getWith2mLatency", method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getWith2mLatency() {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0; i<=9; i++) {
            integerList.add(i);
        }
        return Flux.fromIterable(integerList).delayElements(Duration.ofSeconds(12));
    }
}
