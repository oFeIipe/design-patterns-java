package GOF.Facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCoded = CodecFactory.extract(file);

        Codec destinationCodec;
        if(format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }
        else{
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCoded);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("Termino");
        return result;
    }
}
