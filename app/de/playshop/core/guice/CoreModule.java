package de.playshop.core.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.mongodb.Mongo;
import de.playshop.core.mongodb.MongoFactory;
import de.playshop.core.services.DTDService;

/**
 * @author <a href="mailto:tunggad@yahoo.com">Vu Duc Tung</a>
 *         Date: 09.06.11
 *         Time: 18:20
 *         Since Version: 0.1
 */
public class CoreModule extends AbstractModule {
  protected void configure() {
    bind(DTDService.class);
  }

  @Provides
  Mongo provideMongo() {
    return MongoFactory.getInstance();
  }
}
