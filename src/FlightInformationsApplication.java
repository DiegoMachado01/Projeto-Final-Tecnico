
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class FlightInformationsApplication {

    private static final String CSV_FILE_NAME = "C:\\Java\\FlightInformations\\";

    public static void main(String[] args) throws IOException {
        Voo vooObjeto = new Voo();

        
        public static Stream<Voo> lerCSV() throws FileNotFoundException {
        return Files.readAllines(Path())
                //Converter para lista
                .stream()
                //Mapear as linhas  por ";"
                .map(linha->{ String[] elementos = linha.split(";");
                return new Voo (
                elementos [0],//rigem 
                elementos [1],//destino 
                elementos [2],//companhia 
                elementos [3],//partida
                elementos [4],//chegada
                elementos [5],//preco
               
                );
//        List<Voo> voos = List.of(
//                new Voo("GRU-Brasil", "MEL-Austrália", "Gol Airlines", "13/04/2022 22:00:00 (-03:00)", "14/04/2022 08:00:00 (-11:00)", 3524.00),
//                new Voo("GRU-Brasil", "MEL-Austrália", "Lufthansa", "10/04/2022 14:00:00 (-07:00)", "11/04/2022 06:00:00 (+03:00)", 4848.00),
//                new Voo("GRU-Brasil", "MEL-Austrália", "United Airlines", "18/04/2022 16:00:00 (Z)", "19/04/2022 04:00:00 (+01:00)", 3928.00),
//                new Voo("GRU-Brasil", "FEN-Brasil", "AirCanada", "25/04/2022 17:00:00 (+07:00)", "25/04/2022 18:00:00 (-03:00)", 3793.00),
//                new Voo("KIN-Jamaica", "MEL-Austrália", "LATAM Airlines", "15/04/2022 19:00:00 (-01:00)", "16/04/2022 13:00:00 (-05:00)", 2044.00),
//                new Voo("GRU-Brasil", "LIS-Portugal", "Emirates", "11/04/2022 16:00:00 (-02:00)", "12/04/2022 12:00:00 (-02:00)", 4539.00),
//                new Voo("GRU-Brasil", "KIN-Jamaica", "LATAM Airlines", "09/04/2022 07:00:00 (-12:00)", "09/04/2022 18:00:00 (-05:00)", 2006.00)
//        );

        List<String> imprimeVoo = new ArrayList<>();

        List<Voo> voosOrigemDestino
                = voos.stream()
                        .filter(voo -> Objects.equals(voo.getOrigem(), "GRU-Brasil"))
                        .filter(voo -> Objects.equals(voo.getDestino(), "MEL-Austrália"))
                        .sorted(Comparator.comparing(Voo::getPreco))
                        .collect(Collectors.toList());

//        System.out.println(voosOrigemDestino);
        voosOrigemDestino.forEach(System.out::println);
        //      voosOrigemDestino.forEach(Voo::calculaDuracao);

        //chamando voo mais rapido
//        String vooMaisRapido = voosOrigemDestino.stream()
//                        .min(Comparator.comparing(Voo::calculaDuracao))
//                                .toString();
        Optional<Voo> vooMaisRapido = voosOrigemDestino.stream()
                .min(Comparator.comparing(Voo::calculaDuracao));

        imprimeVoo.add(vooMaisRapido.orElse(null).toString());

        System.out.println("\nO voo Mais Rapido e:");
        System.out.println(vooMaisRapido.orElse(null));
//        System.out.println("\nPrintando vooTeste:");
//        System.out.println(vooTeste.toString());
        System.out.println("\nA duracao voo mais rapido");
        System.out.println(vooMaisRapido.map(Voo::getDuracao).orElse(null));

//pra cima daqui é voo mais curto
        Optional<Voo> vooMaisLongo = voosOrigemDestino.stream()
                .max(Comparator.comparing(Voo::calculaDuracao));

        imprimeVoo.add(vooMaisLongo.toString());

        System.out.println("\nO Voo mais longo nesse percurso é:");
        System.out.println(vooMaisLongo.orElse(null));

        System.out.println("\nA duracao voo mais longo");
        System.out.println(vooMaisLongo.map(Voo::getDuracao).orElse(null));

        double duracaoMedia = voosOrigemDestino.stream()
                .mapToLong(Voo::calculaDuracao).average().getAsDouble();

        String mediaDaDuracao = ("Média da duração dos voos:" + duracaoMedia + " horas");
        imprimeVoo.add(mediaDaDuracao);

        System.out.printf("\nMédia da duração: %.2f horas", duracaoMedia);

        OptionalDouble preco = voosOrigemDestino.stream()
                .mapToDouble(Voo::getPreco).average();

        double precoMedio = preco.getAsDouble();

        String mediaDoPreco = ("Média da preco: " + duracaoMedia + " horas");
        imprimeVoo.add(mediaDoPreco);

        System.out.printf("\nMédia dos preços: R$%.2f", precoMedio);

        gravaCSV("listaFinalDosVoos.csv", imprimeVoo);
    }
//
//    public static void gravaCSV(String caminhoArquivo, List<String> dataLines) throws FileNotFoundException, IOException {
//        try (
//                FileOutputStream imprimeVoo = new FileOutputStream(caminhoArquivo);
//                PrintWriter pr = new PrintWriter(imprimeVoo )) {
//            pr.println(imprimeVoo );
//            imprimeVoo.close();
//
//        }
    
     public static void gravaCSV(String caminhoArquivo, List<String> dataLines) throws FileNotFoundException {
        Path caminho = Paths.get(caminhoArquivo);

        try {
            Files.write(caminho, dataLines);
        } catch (IOException excecao) { }
    }
}

//  public static void gravaCSV(String nomeArquivo, List<String> dataLines) throws IOException {
//    File csvOutputFile = new File(CSV_FILE_NAME+nomeArquivo);
//    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
//        dataLines.forEach(pw::println);
//    }
//     assertTrue(csvOutputFile.exists());
// }
//    public static void gravaCSV(String caminhoArquivo, List<String> imprimeVoo) {
//        File Arquivo = new File("Arquivo.CSV");
//        try (
//                FileWriter saida = new FileWriter(caminhoArquivo);
//                BufferedWriter saidaCombuffer = new BufferedWriter(saida)) {
//            for (String linha : imprimeVoo) {
//                saidaCombuffer.write(linha);
//                 saidaCombuffer.newLine();
//            }
//            saidaCombuffer.flush();
//        } catch(FileNotFoundException exceçao) {
//            System.out.println("Arquivo não existe");
//        } catch (IOException ex) {
//            System.out.println("IOExcepetion");
//        }



//}
//    public String convertToCSV(Stream<String> data) {
//        return data
//                .map(this::escapeSpecialCharacters)
//                .collect(Collectors.joining(""));
//    }
//
//    public String escapeSpecialCharacters(String data) {
//        String escapedData = data.replaceAll("\\R", " ");
//        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
//            data = data.replace("\"", "\"\"");
//            escapedData = "\"" + data + "\"";
//        }
//        return escapedData;
//    }

