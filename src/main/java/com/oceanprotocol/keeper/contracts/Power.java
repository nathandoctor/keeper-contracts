package com.oceanprotocol.keeper.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.0.1.
 */
public class Power extends Contract {
    private static final String BINARY = "0x60c0604052600360808190527f302e33000000000000000000000000000000000000000000000000000000000060a090815261003e91600091906107f3565b5034801561004b57600080fd5b506001606060020a641c35fedd1502036021556001605e60020a646c3390ecc902036022556001606160020a640cf801476102036023556001605f60020a6431bdb23e1d02036024556001605b60020a6502fb1d8fe08302036025556001605a60020a6505b771955b3702036026556001605960020a650af67a93bb5102036027556001605860020a6515060c256cb302036028556001605860020a651428a2f98d7302036029556001605660020a654d51566397090203602a556001605560020a65944620b0e70f0203602b557011c592761c666fffffffffffffffffffff602c5570110a688680a757ffffffffffffffffffff602d55701056f1b5bedf77ffffffffffffffffffff602e55700faadceceeff8bffffffffffffffffffff602f55700f05dc6b27edadffffffffffffffffffff603055700e67a5a25da4107fffffffffffffffffff603155700dcff115b14eedffffffffffffffffffff603255700d3e7a392431239fffffffffffffffffff603355700cb2ff529eb71e4fffffffffffffffffff603455700c2d415c3db974afffffffffffffffffff603555700bad03e7d883f69bffffffffffffffffff603655700b320d03b2c343d5ffffffffffffffffff603755700abc25204e02828dffffffffffffffffff603855700a4b16f74ee4bb207fffffffffffffffff6039557009deaf736ac1f569ffffffffffffffffff603a55700976bd9952c7aa957fffffffffffffffff603b557009131271922eaa606fffffffffffffffff603c557008b380f3558668c46fffffffffffffffff603d55700857ddf0117efa215bffffffffffffffff603e556001608360020a03603f557007abbf6f6abb9d087fffffffffffffffff60405570075af62cbac95f7dfa7fffffffffffffff60415570070d7fb7452e187ac13fffffffffffffff6042557006c3390ecc8af379295fffffffffffffff60435570067c00a3b07ffc01fd6fffffffffffffff604455700637b647c39cbb9d3d27ffffffffffffff6045557005f63b1fc104dbd39587ffffffffffffff6046557005b771955b36e12f7235ffffffffffffff60475570057b3d49dda84556d6f6ffffffffffffff60485570054183095b2c8ececf30ffffffffffffff60495570050a28be635ca2b888f77fffffffffffff604a557004d5156639708c9db33c3fffffffffffff604b557004a23105873875bd52dfdfffffffffffff604c55700471649d87199aa990756fffffffffffff604d557004429a21a029d4c1457cfbffffffffffff604e55700415bc6d6fb7dd71af2cb3ffffffffffff604f557003eab73b3bbfe282243ce1ffffffffffff6050557003c1771ac9fb6b4c18e229ffffffffffff605155700399e96897690418f785257fffffffffff605255700373fc456c53bb779bf0ea9fffffffffff60535570034f9e8e490c48e67e6ab8bfffffffffff60545570032cbfd4a7adc790560b3337ffffffffff60555570030b50570f6e5d2acca94613ffffffffff6056557002eb40f9f620fda6b56c2861ffffffffff6057557002cc8340ecb0d0f520a6af58ffffffffff6058557002af09481380a0a35cf1ba02ffffffffff605955700292c5bdd3b92ec810287b1b3fffffffff605a55700277abdcdab07d5a77ac6d6b9fffffffff605b5570025daf6654b1eaa55fd64df5efffffffff605c55700244c49c648baa98192dce88b7ffffffff605d5570022ce03cd5619a311b2471268bffffffff605e55700215f77c045fbe885654a44a0fffffffff605f556001608160020a036060557001eaefdbdaaee7421fc4d3ede5ffffffff6061557001d6bd8b2eb257df7e8ca57b09bfffffff6062557001c35fedd14b861eb0443f7f133fffffff6063557001b0ce43b322bcde4a56e8ada5afffffff60645570019f0028ec1fff007f5a195a39dfffffff60655570018ded91f0e72ee74f49b15ba527ffffff60665570017d8ec7f04136f4e5615fd41a63ffffff60675570016ddc6556cdb84bdc8d12d22e6fffffff60685570015ecf52776a1155b5bd8395814f7fffff60695570015060c256cb23b3b3cc3754cf40ffffff606a557001428a2f98d728ae223ddab715be3fffff606b5570013545598e5c23276ccf0ede68034fffff606c557001288c4161ce1d6f54b7f61081194fffff606d5570011c592761c666aa641d5a01a40f17ffff606e55700110a688680a7530515f3e6e6cfdcdffff606f557001056f1b5bedf75c6bcb2ce8aed428ffff6070556ffaadceceeff8a0890f3875f008277fff6071556ff05dc6b27edad306388a600f6ba0bfff6072556fe67a5a25da41063de1495d5b18cdbfff6073556fdcff115b14eedde6fc3aa5353f2e4fff6074556fd3e7a3924312399f9aae2e0f868f8fff6075556fcb2ff529eb71e41582cccd5a1ee26fff6076556fc2d415c3db974ab32a51840c0b67edff6077556fbad03e7d883f69ad5b0a186184e06bff6078556fb320d03b2c343d4829abd6075f0cc5ff6079556fabc25204e02828d73c6e80bcdb1a95bf607a556fa4b16f74ee4bb2040a1ec6c15fbbf2df607b556f9deaf736ac1f569deb1b5ae3f36c130f607c556f976bd9952c7aa957f5937d790ef65037607d556f9131271922eaa6064b73a22d0bd4f2bf607e556f8b380f3558668c46c91c49a2f8e967b9607f556f857ddf0117efa215952912839f6473e660805561088e565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061083457805160ff1916838001178555610861565b82800160010185558215610861579182015b82811115610861578251825591602001919060010190610846565b5061086d929150610871565b5090565b61088b91905b8082111561086d5760008155600101610877565b90565b6101898061089d6000396000f3006080604052600436106100405763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166354fd4d508114610045575b600080fd5b34801561005157600080fd5b5061005a6100cf565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561009457818101518382015260200161007c565b50505050905090810190601f1680156100c15780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6000805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156101555780601f1061012a57610100808354040283529160200191610155565b820191906000526020600020905b81548152906001019060200180831161013857829003601f168201915b5050505050815600a165627a7a72305820769a8a2e7b38bd3a2fda3761f14e7c47768f7530db3a48da7a725ce72059c9ac0029";

    public static final String FUNC_VERSION = "version";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Power(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Power(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Power(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Power(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> version() {
        final Function function = new Function(FUNC_VERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Power load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Power(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Power load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Power(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Power load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Power(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Power load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Power(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Power> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Power.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Power> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Power.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Power> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Power.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Power> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Power.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}