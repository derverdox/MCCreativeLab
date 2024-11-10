package de.verdox.mccreativelab.impl.vanilla;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapter;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import de.verdox.mccreativelab.wrapper.platform.adapter.NoAdapterFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AdapterTests {


    @BeforeEach
    public void setUp() {
        // Leeren der TYPE_TO_ADAPTER_MAPPING zwischen den Tests
        MCCAdapters.TYPE_TO_ADAPTER_MAPPING.clear();
    }

    @Test
    public void testRegisterAdapter() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        MCCAdapter<String> adapter = MCCAdapters.register(apiType);

        // Überprüfen, ob der Adapter registriert wurde
        assertNotNull(adapter, "Adapter should not be null after registration.");
        assertTrue(MCCAdapters.TYPE_TO_ADAPTER_MAPPING.contains(apiType), "TYPE_TO_ADAPTER_MAPPING should contain the registered adapter.");
    }

    @Test
    public void testRegisterDuplicateAdapterThrowsException() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        MCCAdapters.register(apiType);

        // Zweites Mal registrieren sollte eine Exception werfen
        assertThrows(IllegalArgumentException.class, () -> MCCAdapters.register(apiType), "Registering an adapter twice should throw an exception.");
    }

    @Test
    public void testGetAdapter() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        MCCAdapter<String> adapter = MCCAdapters.register(apiType);

        // Überprüfen, ob getAdapter das richtige Objekt zurückgibt
        assertEquals(adapter, MCCAdapters.getAdapter(apiType), "getAdapter should return the registered adapter.");
    }

    @Test
    public void testGetAdapterCreatesNewIfNotPresent() {
        TypeToken<String> apiType = TypeToken.of(String.class);

        // Vorher: Adapter existiert nicht
        assertFalse(MCCAdapters.TYPE_TO_ADAPTER_MAPPING.contains(apiType), "Adapter should not exist before calling getAdapter.");

        MCCAdapter<String> adapter = MCCAdapters.getAdapter(apiType);

        // Nachher: Adapter sollte automatisch erstellt werden
        assertNotNull(adapter, "getAdapter should create and return a new adapter if none was present.");
        assertTrue(MCCAdapters.TYPE_TO_ADAPTER_MAPPING.contains(apiType), "TYPE_TO_ADAPTER_MAPPING should contain the newly created adapter.");
    }

    @Test
    public void testWrapAndUnwrap() {
        // Dummy-Typen und -Objekte für den Test
        TypeToken<String> apiType = TypeToken.of(String.class);
        TypeToken<Integer> platformType = TypeToken.of(Integer.class);
        String apiObject = "TestString";
        Integer platformObject = 123;

        // Registrieren eines Mock-Adapters für die Tests
        MCCAdapter<String> mockAdapter = mock(MCCAdapter.class);
        when(mockAdapter.wrap(platformObject)).thenReturn(apiObject);
        when(mockAdapter.unwrap(platformType, apiObject)).thenReturn(platformObject);

        MCCAdapters.TYPE_TO_ADAPTER_MAPPING.put(apiType, mockAdapter);

        // Test Wrap
        String wrapped = MCCAdapters.wrap(apiType, platformType, platformObject);
        assertEquals(apiObject, wrapped, "Wrap should return the correct wrapped object.");
        verify(mockAdapter, times(1)).wrap(platformObject);

        // Test Unwrap
        Integer unwrapped = MCCAdapters.unwrap(platformType, apiType, apiObject);
        assertEquals(platformObject, unwrapped, "Unwrap should return the correct unwrapped object.");
        verify(mockAdapter, times(1)).unwrap(platformType, apiObject);
    }

    @Test
    public void testWrapNullReturnsNull() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        TypeToken<Integer> platformType = TypeToken.of(Integer.class);

        assertNull(MCCAdapters.wrap(apiType, platformType, null), "Wrapping a null object should return null.");
    }

    @Test
    public void testUnwrapNullReturnsNull() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        TypeToken<Integer> platformType = TypeToken.of(Integer.class);

        assertNull(MCCAdapters.unwrap(platformType, apiType, null), "Unwrapping a null object should return null.");
    }

    @Test
    public void testWrapThrowsNoAdapterFoundException() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        TypeToken<Integer> platformType = TypeToken.of(Integer.class);

        // Überprüfen, ob eine Ausnahme geworfen wird, wenn kein Adapter vorhanden ist
        assertThrows(NoAdapterFoundException.class, () -> MCCAdapters.wrap(apiType, platformType, 123), "Wrap should throw NoAdapterFoundException if no adapter is registered.");
    }

    @Test
    public void testUnwrapThrowsNoAdapterFoundException() {
        TypeToken<String> apiType = TypeToken.of(String.class);
        TypeToken<Integer> platformType = TypeToken.of(Integer.class);

        // Überprüfen, ob eine Ausnahme geworfen wird, wenn kein Adapter vorhanden ist
        assertThrows(NoAdapterFoundException.class, () -> MCCAdapters.unwrap(platformType, apiType, "Test"), "Unwrap should throw NoAdapterFoundException if no adapter is registered.");
    }

}
