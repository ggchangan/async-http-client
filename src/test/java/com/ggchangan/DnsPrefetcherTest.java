package com.ggchangan;

import java.io.IOException;

import com.ggchangan.dns.DnsPrefecher;

import org.junit.Test;

public class DnsPrefetcherTest {

    @Test
    public void testPrefetch() throws IOException {
        DnsPrefecher prefecher = DnsPrefecher.getInstance();
        prefecher.prefetch("google.com");
    }
}
