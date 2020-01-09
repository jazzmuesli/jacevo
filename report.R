d=read.csv('target/metrics.csv', sep=';')
d[!is.na(d$covratio.evo)|!is.na(d$covratio.test),grep("prodClassName|covratio.|^T", value=T,names(d))]

