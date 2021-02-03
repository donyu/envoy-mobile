package io.envoyproxy.envoymobile

import io.envoyproxy.envoymobile.engine.EnvoyEngine

/**
 * Envoy implementation of `PulseClient`.
 */
internal class PulseClientImpl constructor(
  internal val engine: EnvoyEngine
) : PulseClient {

  override fun counter(vararg elements: Element): Counter {
    return CounterImpl(engine, elements.asList())
  }

  override fun gauge(vararg elements: Element): Gauge {
    return GaugeImpl(engine, elements.asList())
  }

  override fun timer(vararg elements: Element): Timer {
    return TimerImpl(engine, elements.asList())
  }

  override fun histogram(vararg elements: Element): Histogram {
    return HistogramImpl(engine, elements.asList())
  }
}
