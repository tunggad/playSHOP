package de.playshop.core.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import play.modules.guice.GuiceSupport;

/**
 * @author <a href="mailto:tunggad@yahoo.com">Vu Duc Tung</a>
 *         Date: 11.06.11
 *         Time: 11:24
 *         Since Version: 0.1
 */
public class PlayShopGuiceSupport extends GuiceSupport{
  @Override
  protected Injector configure() {
    return Guice.createInjector(new CoreModule());
  }
}
