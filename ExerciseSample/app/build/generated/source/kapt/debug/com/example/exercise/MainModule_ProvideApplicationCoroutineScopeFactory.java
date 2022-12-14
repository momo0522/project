// Generated by Dagger (https://dagger.dev).
package com.example.exercise;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineScope;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainModule_ProvideApplicationCoroutineScopeFactory implements Factory<CoroutineScope> {
  private final MainModule module;

  public MainModule_ProvideApplicationCoroutineScopeFactory(MainModule module) {
    this.module = module;
  }

  @Override
  public CoroutineScope get() {
    return provideApplicationCoroutineScope(module);
  }

  public static MainModule_ProvideApplicationCoroutineScopeFactory create(MainModule module) {
    return new MainModule_ProvideApplicationCoroutineScopeFactory(module);
  }

  public static CoroutineScope provideApplicationCoroutineScope(MainModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplicationCoroutineScope());
  }
}
