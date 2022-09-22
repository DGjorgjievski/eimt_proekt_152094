import { Box, createStyles, makeStyles, Typography } from "@material-ui/core";
import { userData } from "./User.data";
import { ReservationItem } from "../../components/ReservationItem/ReservationItem";
import React, { useEffect, useState } from "react";
import { getUserReservations } from "../../pages/Home/Home.service";
import { UserReservation } from "../../config";

const useStyles = makeStyles(() =>
  createStyles({
    aboutContainer: {
      maxWidth: "90vw",
      margin: "0 auto",
      display: "flex",
      flexDirection: "column",
    },
    contentContainer: {
      marginTop: "40px",
    },
  })
);

export const User = () => {

  const [isVisible, setIsVisible] = useState(false);
  const [userReservation, setuserReservation] = useState<UserReservation | null>(
    null
  );
  const [retrievedData, setRetrievedData] = useState<any>(null);

  useEffect(() => {
    getUserReservations().then((res) => setRetrievedData(res));
    console.log(retrievedData);
  }, []);

  const handleChanges = () => {
  };
  const classes = useStyles();
  return (
    <Box className={classes.aboutContainer}>
      <Box>
        <Typography variant="h5">User name</Typography>
        <Typography variant="h6">User points</Typography>
      </Box>
      <Box>
        {!!retrievedData &&
        retrievedData.map((userReservation: any) => (
          <ReservationItem
            LocalName={userReservation.localName}
            dateTime={userReservation.dateTime}
            id={userReservation.id}
            confirmed={userReservation.isConfirmed}
            handleChanges={handleChanges}
          ></ReservationItem>
        ))}
      </Box>
    </Box>
  );
};
